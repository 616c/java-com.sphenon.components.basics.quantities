// instantiated with javainst.pl from /workspace/sphenon/projects/components/basics/quantities/v0001/origin/source/java/com/sphenon/basics/quantities/templates/Optional.javatpl
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

public class Optional_long_ implements Dumpable {

    protected Long value;

    public Optional_long_ (CallContext context) {
        this.value = null;
    }

    public Optional_long_ (CallContext context, Long value) {
        this.value = value;
    }

    public Optional_long_ (CallContext context, long value) {
        this.value = new Long(value);
    }

    public Long getValue (CallContext context) {
        return this.value;
    }

    public void setValue (CallContext context, Long value) {
        this.value = value;
    }

    public String toString() {
        return (this.value == null ? "---" : this.value.toString());
    }

    public void dump(CallContext context, DumpNode dump_node) {
        dump_node.dump(context, this.value.toString());
    }
}
