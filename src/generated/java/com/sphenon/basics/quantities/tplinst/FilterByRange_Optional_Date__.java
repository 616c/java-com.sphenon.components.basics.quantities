// instantiated with javainst.pl from /workspace/sphenon/projects/components/basics/retriever/v0001/origin/source/java/com/sphenon/basics/retriever/templates/FilterByRange.javatpl
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

public class FilterByRange_Optional_Date__ extends GenericFilterBase<Optional_Date_> implements Filter_Optional_Date__, FilterByRange {

    protected Date minimum;
    protected Date maximum;
    protected boolean include_minimum;
    protected boolean include_maximum;

    static protected Type target_type;

    public FilterByRange_Optional_Date__ (CallContext context) {
        super(context, target_type == null ? (target_type = TypeManager.get(context, Optional_Date_.class)) : target_type);
        this.include_minimum = true;
        this.include_maximum = true;
    }

    public FilterByRange_Optional_Date__ (CallContext context, Date minimum, Date maximum) {
        this(context);
        this.setMinimum(context, minimum);
        this.setMaximum(context, maximum);
    }

    public FilterByRange_Optional_Date__ (CallContext context, Date minimum, Date maximum, boolean include_minimum, boolean include_maximum) {
        this(context);
        this.setMinimum(context, minimum);
        this.setMaximum(context, maximum);
        this.setIncludeMinimum(context, include_minimum);
        this.setIncludeMaximum(context, include_maximum);
    }

    public Date getMinimum (CallContext context) {
        return this.minimum;
    }

    public Date getMaximum (CallContext context) {
        return this.maximum;
    }

    public void setMinimum (CallContext context, Date minimum) {
        this.minimum = minimum;
        this.setFilterEnabled(context, (this.minimum == null && this.maximum == null ? false : true));
    }

    public void setMaximum (CallContext context, Date maximum) {
        this.setFilterEnabled(context, true);
        this.maximum = maximum;
        this.setFilterEnabled(context, (this.minimum == null && this.maximum == null ? false : true));
    }

    public void setMinimum (CallContext context, String minimum) {
        setMinimum(context, toType(context, minimum));
    }

    public void setMaximum (CallContext context, String maximum) {
        setMaximum(context, toType(context, maximum));
    }

    protected Date toType(CallContext context, String value) {
        return ((java.util.Date) com.sphenon.basics.format.Formatter.parse(context, "date:", value));
    }

    public boolean getIncludeMinimum (CallContext context) {
        return this.include_minimum;
    }

    public void setIncludeMinimum (CallContext context, boolean include_minimum) {
        this.include_minimum = include_minimum;
    }

    public boolean getIncludeMaximum (CallContext context) {
        return this.include_maximum;
    }

    public void setIncludeMaximum (CallContext context, boolean include_maximum) {
        this.include_maximum = include_maximum;
    }

    public boolean matches (CallContext context, Optional_Date_ object) {
        return (    (    this.minimum == null
                      || (  this.include_minimum
                            ? (object != null && object.getValue(context) != null && ( ! this.minimum.after(object.getValue(context)))) || ((object == null || object.getValue(context) == null) && object instanceof OptionalUpperBound_Date_)
                            : (object != null && object.getValue(context) != null && ( this.minimum.before(object.getValue(context)))) || ((object == null || object.getValue(context) == null) && object instanceof OptionalUpperBound_Date_)
                         )
                    )
                 && (    this.maximum == null
                      || (  this.include_maximum
                            ? (object != null && object.getValue(context) != null && ( ! this.maximum.before(object.getValue(context)))) || ((object == null || object.getValue(context) == null) && object instanceof OptionalLowerBound_Date_)
                            : (object != null && object.getValue(context) != null && ( this.maximum.after(object.getValue(context)))) || ((object == null || object.getValue(context) == null) && object instanceof OptionalLowerBound_Date_)
                         )
                    )
               );
    }
}
