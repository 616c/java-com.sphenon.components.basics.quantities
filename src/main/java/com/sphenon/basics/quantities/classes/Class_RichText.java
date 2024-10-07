package com.sphenon.basics.quantities.classes;

/****************************************************************************
  Copyright 2001-2024 Sphenon GmbH

  Licensed under the Apache License, Version 2.0 (the "License"); you may not
  use this file except in compliance with the License. You may obtain a copy
  of the License at http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  License for the specific language governing permissions and limitations
  under the License.
*****************************************************************************/

import com.sphenon.basics.context.*;
import com.sphenon.basics.search.*;
import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.factories.*;
import com.sphenon.basics.encoding.*;
import com.sphenon.sm.tsm.*;

import java.util.Vector;

public class Class_RichText implements RichText, Searchable, TSMMapped {

    protected Class_RichText (CallContext context, String text, String media_type) {
        this.text = text;
        this.media_type = media_type;
    }

    static public Class_RichText create (CallContext context, String text, String media_type) {
        return new Class_RichText(context, text, media_type);
    }

    protected String text;

    public String getText (CallContext context) {
        return this.text;
    }

    public void setText (CallContext context, String text) {
        this.text = text;
    }

    protected String media_type;

    public String getMediaType(CallContext context) {
        return this.media_type;
    }

    public void setMediaType (CallContext context, String media_type) {
        this.media_type = media_type;
    }

    public String toString () {
        return this.text;
    }

    // Searchable ----------------------------------------------------------

    public String getSearchableFullText(CallContext context) {
        return this.getText(context);
    }

    static protected String[] search_text_tags = { "type" };

    public String[] getSearchableTags(CallContext context) {
        return search_text_tags;
    }

    public String[] getSearchableTextByTag(CallContext context, String tag) {
        if (tag.equals("type")) {
            String[] result = { this.getMediaType(context) };
            return result;
        } else {
            return null;
        }
    }

    // ---------------------------------------------------------------------

    public Object saveToPersistentType(CallContext context) {
        StringBuilder sb = new StringBuilder();
        
        if (this.getMediaType(context) != null) {
            Encoding.recode(context, this.getMediaType(context), sb, Encoding.UTF8, Encoding.URI);
        }
        sb.append("/");
        if (this.getText(context) != null) {
            sb.append(this.getText(context));
        }

        return sb.toString();
    }

    public Class_RichText loadFromPersistentType(CallContext context, Object persistent_type) {
        String[] parts = ((String) persistent_type).split("/", 2);
        this.setMediaType(context, Encoding.recode(context, parts[0], Encoding.URI, Encoding.UTF8));
        this.setText(context, parts[1]);
        return this;
    }
}
