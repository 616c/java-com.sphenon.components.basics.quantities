package com.sphenon.basics.quantities.factories;

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
import com.sphenon.basics.context.classes.*;
import com.sphenon.basics.configuration.*;
import com.sphenon.basics.factory.*;

import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;
import com.sphenon.basics.validation.returncodes.*;

public class Factory_RichText implements Factory {
    /* -------------- extensible factory instantiation --------------------------------------------------------------------------------------- */
    static protected Configuration config;
    static protected FactoryInstantiator<Factory_RichText> factory_instantiator;
    static {
      CallContext context = RootContext.getInitialisationContext();
      config = Configuration.create(context, "com.sphenon.basics.quantities.factories.Factory_RichText");
      factory_instantiator = new FactoryInstantiator(context, Factory_RichText.class) { protected Factory_RichText createDefault(CallContext context) { return new Factory_RichText(context); } };
    };
    /* --------------------------------------------------------------------------------------------------------------------------------------- */
    static public Factory_RichText newInstance (CallContext context) {
        return factory_instantiator.newInstance(context);
    }
    /* --------------------------------------------------------------------------------------------------------------------------------------- */

    protected Factory_RichText (CallContext context) {
    }

    static public RichText construct (CallContext context) {
        return newInstance(context).create(context);
    }

    static public RichText construct (CallContext context, String text) {
        Factory_RichText factory = newInstance(context);
        factory.setText(context, text);
        factory.setMediaType(context, factory.defaultMediaType(context));
        return factory.create(context);
    }

    static public RichText construct (CallContext context, String text, String media_type) {
        Factory_RichText factory = newInstance(context);
        factory.setText(context, text);
        factory.setMediaType(context, media_type);
        return factory.create(context);
    }

    public RichText create (CallContext context) {
        return Class_RichText.create(context, text, media_type);
    }

    public Object createObject    (CallContext context) throws ValidationFailure {
        return create(context);
    }

    public void   reset           (CallContext context) {
    }

    public String defaultMediaType(CallContext context) {
        return "text/html";
    }

    /* --------------------------------------------------------------------------------------------------------------------------------------- */

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

    public void   validate        (CallContext context) throws ValidationFailure {
    }

    /* --------------------------------------------------------------------------------------------------------------------------------------- */

    public void confirmAttributes (CallContext context) {
    }

    public void validateFinally   (CallContext context) throws ValidationFailure {
    }
}
