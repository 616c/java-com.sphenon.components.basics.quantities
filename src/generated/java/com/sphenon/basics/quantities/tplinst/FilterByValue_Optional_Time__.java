// instantiated with javainst.pl from /workspace/sphenon/projects/components/basics/retriever/v0001/origin/source/java/com/sphenon/basics/retriever/templates/FilterByValue.javatpl
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
import com.sphenon.basics.retriever.*;
import com.sphenon.basics.retriever.classes.*;
import com.sphenon.basics.metadata.*;

public class FilterByValue_Optional_Time__ extends GenericFilterBase<Optional_Time_> implements Filter_Optional_Time__, FilterByValue  {

    static protected Type target_type;

    public FilterByValue_Optional_Time__ (CallContext context) {
        super(context, target_type == null ? (target_type = TypeManager.get(context, Optional_Time_.class)) : target_type);
    }

    public FilterByValue_Optional_Time__ (CallContext context, Optional_Time_ value) {
        this(context);
        this.setValue(context, value);
    }

    public FilterByValue_Optional_Time__ (CallContext context, Optional_Time_... values) {
        this(context);
        this.setValues(context, values);
    }

    protected Optional_Time_[] values;

    public Optional_Time_ getValue (CallContext context) {
        return this.values == null || this.values.length != 1 ? null : this.values[0];
    }

    public void setValue (CallContext context, Optional_Time_ value) {
        this.setValues(context, value);
    }

    public void setValue (CallContext context, String value) {
        setValue(context, toType(context, value));
    }

    protected Optional_Time_ toType(CallContext context, String value) {
        return null;
    }

    public Optional_Time_[] getValues (CallContext context) {
        return this.values;
    }

    public void setValues (CallContext context, Optional_Time_... values) {
        this.setFilterEnabled(context, true);
        this.values = values;
    }

    public Object getValueAsObject (CallContext context) {
        return this.values != null && this.values.length == 1 ? this.values[0] : this.values;
    }

    public FilterByValue setValueAsObject(CallContext context, Object value) {
        return this.setValueAsObject(context, (Optional_Time_) value);
    }

    public boolean matches (CallContext context, Optional_Time_ object) {
        if (this.filter_enabled == false) { return true; }
        if (this.values != null) {
            if (object != null) {
                for (Optional_Time_ value : values) {
                    if (value.getValue(context) == (object == null ? null : object.getValue(context))) { return true; }
                }
            }
        }
        return false;
    }

    public boolean isActive(CallContext context) {
        if (this.filter_enabled == false) { return false; }
        if (this.values != null) { return true; }
        return false;
    }
}
