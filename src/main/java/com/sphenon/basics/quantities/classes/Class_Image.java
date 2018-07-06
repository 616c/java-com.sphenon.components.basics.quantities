package com.sphenon.basics.quantities.classes;

/****************************************************************************
  Copyright 2001-2018 Sphenon GmbH

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
import com.sphenon.basics.validation.returncodes.*;

public class Class_Image implements Image {

    protected Class_Image (CallContext context, String name) {
        this.name = name;
    }

    static public Image create (CallContext context, String name) {
        return new Class_Image(context, name);
    }

    protected String name;

    public String getName (CallContext context) {
        return this.name;
    }

    public void setName (CallContext context, String name) {
        this.name = name;
    }

    public void validate(CallContext context) throws ValidationFailure{ 
    }
    
    // Searchable ----------------------------------------------------------

    public String getSearchableFullText(CallContext context) {
        return this.getName(context);
    }

    public String[] getSearchableTags(CallContext context) {
        return null;
    }

    public String[] getSearchableTextByTag(CallContext context, String tag) {
        return null;
    }

    // ---------------------------------------------------------------------
}
