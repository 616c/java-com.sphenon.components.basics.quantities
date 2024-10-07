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

public class Factory_Image implements Factory {
    /* -------------- extensible factory instantiation --------------------------------------------------------------------------------------- */
    static protected FactoryInstantiator<Factory_Image> factory_instantiator;
    static {
      CallContext context = RootContext.getInitialisationContext();
      factory_instantiator = new FactoryInstantiator(context, Factory_Image.class) { protected Factory_Image createDefault(CallContext context) { return new Factory_Image(context); } };
    };
    /* --------------------------------------------------------------------------------------------------------------------------------------- */
    static public Factory_Image newInstance (CallContext context) {
        return factory_instantiator.newInstance(context);
    }
    /* --------------------------------------------------------------------------------------------------------------------------------------- */

    protected Factory_Image (CallContext context) {
    }

    static public Image construct (CallContext context) {
        return newInstance(context).create(context);
    }

    static public Image construct (CallContext context, String name) {
        Factory_Image factory = newInstance(context);
        factory.setName(context, name);
        return factory.create(context);
    }

    public Image create (CallContext context) {
        return Class_Image.create(context, name);
    }

    public Object createObject    (CallContext context) throws ValidationFailure {
        return create(context);
    }

    public void   reset           (CallContext context) {
    }

    /* --------------------------------------------------------------------------------------------------------------------------------------- */

    protected String name;

    public String getName (CallContext context) {
        return this.name;
    }

    public void setName (CallContext context, String name) {
        this.name = name;
    }

    public void   validate        (CallContext context) throws ValidationFailure {
    }

    /* --------------------------------------------------------------------------------------------------------------------------------------- */

    public void confirmAttributes (CallContext context) {
    }

    public void validateFinally   (CallContext context) throws ValidationFailure {
    }
}
