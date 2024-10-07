// instantiated with javainst.pl from /workspace/sphenon/projects/components/basics/smallparts/v0001/origin/source/java/com/sphenon/basics/smallparts/templates/DataSlotImpl.javatpl
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

public class DataSlotImpl_Filter_Object__
    implements DataSlot_Filter_Object__ {

    Filter_Object_ data;

    public DataSlotImpl_Filter_Object__ (CallContext context) {
    }

    public DataSlotImpl_Filter_Object__ (CallContext context, Filter_Object_ data) {
        this.data = data;
    }

    public void set(CallContext context, Filter_Object_ data) {
        this.data = data;
    }

    public void setObject(CallContext context, Object data) {
        set(context, (Filter_Object_)data);
    }

    public Filter_Object_ get(CallContext context) {
        return this.data;
    }

    public Object getObject(CallContext context) {
        return get(context);
    }
}
