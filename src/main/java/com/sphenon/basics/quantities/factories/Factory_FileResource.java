package com.sphenon.basics.quantities.factories;

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
import com.sphenon.basics.context.classes.*;
import com.sphenon.basics.configuration.*;
import com.sphenon.basics.factory.*;

import com.sphenon.basics.quantities.*;
import com.sphenon.basics.quantities.classes.*;

public class Factory_FileResource {
    /* -------------- extensible factory instantiation --------------------------------------------------------------------------------------- */
    static protected Configuration config;
    static protected FactoryInstantiator<Factory_FileResource> factory_instantiator;
    static {
      CallContext context = RootContext.getInitialisationContext();
      config = Configuration.create(context, "com.sphenon.basics.quantities.factories.Factory_FileResource");
      factory_instantiator = new FactoryInstantiator(context, Factory_FileResource.class) { protected Factory_FileResource createDefault(CallContext context) { return new Factory_FileResource(context); } };
    };
    /* --------------------------------------------------------------------------------------------------------------------------------------- */
    static public Factory_FileResource newInstance (CallContext context) {
        return factory_instantiator.newInstance(context);
    }
    /* --------------------------------------------------------------------------------------------------------------------------------------- */

    protected Factory_FileResource (CallContext context) {
    }

    static public FileResource construct (CallContext context) {
        return newInstance(context).create(context);
    }

    static public FileResource construct (CallContext context, String name) {
        Factory_FileResource factory = newInstance(context);
        factory.setName(context, name);
        return factory.create(context);
    }

    public FileResource create (CallContext context) {
        return Class_FileResource.create(context, name);
    }

    protected String name;

    public String getName (CallContext context) {
        return this.name;
    }

    public void setName (CallContext context, String name) {
        this.name = name;
    }
}
