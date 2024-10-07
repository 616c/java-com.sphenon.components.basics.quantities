// instantiated with javainst.pl from /workspace/sphenon/projects/components/basics/quantities/v0001/origin/source/java/com/sphenon/basics/quantities/templates/Factory_Optional.javatpl
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
import com.sphenon.basics.exception.*;

public class Factory_Optional_Time_ {

    protected Time value;

    public Factory_Optional_Time_ (CallContext context) {
        this.value = null;
    }

    public Optional_Time_ create (CallContext context) {
        return new Optional_Time_(context, this.value);
    }

    public Time getValue (CallContext context) {
        return this.value;
    }

    public void setValue (CallContext context, Time value) {
        this.value = value;
    }
}
