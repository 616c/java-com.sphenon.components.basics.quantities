// instantiated with javainst.pl from /workspace/sphenon/projects/components/basics/quantities/v0001/origin/source/java/com/sphenon/basics/quantities/templates/Optional.javatpl

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
// please do not modify this file directly
package com.sphenon.basics.quantities.tplinst;

import com.sphenon.basics.quantities.*;
import com.sphenon.basics.retriever.*;
import com.sphenon.basics.retriever.tplinst.*;
import com.sphenon.basics.factory.*;
import com.sphenon.basics.many.*;
import java.util.Date;
import com.sphenon.basics.validation.returncodes.*;
import com.sphenon.basics.locating.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.debug.*;
import com.sphenon.basics.exception.*;

public class Optional_float_ implements Dumpable {

    protected Float value;

    public Optional_float_ (CallContext context) {
        this.value = null;
    }

    public Optional_float_ (CallContext context, Float value) {
        this.value = value;
    }

    public Optional_float_ (CallContext context, float value) {
        this.value = new Float(value);
    }

    public Float getValue (CallContext context) {
        return this.value;
    }

    public void setValue (CallContext context, Float value) {
        this.value = value;
    }

    public String toString() {
        return (this.value == null ? "---" : this.value.toString());
    }

    public void dump(CallContext context, DumpNode dump_node) {
        dump_node.dump(context, this.value.toString());
    }
}
