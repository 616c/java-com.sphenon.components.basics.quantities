// instantiated with javainst.pl from /workspace/sphenon/projects/components/basics/retriever/v0001/origin/source/java/com/sphenon/basics/retriever/templates/FilterByRegExp.javatpl
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

import java.util.regex.*;

public class FilterByRegExp_RichText_ extends GenericFilterBase<RichText> implements FilterByExpression_RichText_ {

    protected String  regexp;
    protected Pattern regexp_pattern;

    static protected Type target_type;

    public FilterByRegExp_RichText_ (CallContext context) {
        super(context, target_type == null ? (target_type = TypeManager.get(context, RichText.class)) : target_type);
    }

    public FilterByRegExp_RichText_ (CallContext context, String regexp) throws PatternSyntaxException {
        this(context);
        this.setRegExp(context, regexp);
    }

    public String getExpression (CallContext context) {
        return this.getRegExp(context);
    }

    public void setExpression (CallContext context, String expression) {
        this.setRegExp(context, expression);
    }

    public String getRegExp (CallContext context) {
        return this.regexp;
    }

    public void setRegExp (CallContext context, String regexp) throws PatternSyntaxException {
        this.regexp = regexp;
        try {
            this.regexp_pattern = (this.regexp == null ? null : Pattern.compile(this.regexp));
        } catch (PatternSyntaxException pse) {
            this.regexp_pattern = null;
            if (RetrieverPackageInitialiser.getConfiguration(context).get(context, "DEBUG.DisableRegExpMatcher", false) == false) {
                throw pse;
            }
        } finally {
            setFilterEnabled(context, this.regexp_pattern == null ? false : true);
        }
    }

    public boolean matches (CallContext context, RichText object) {
        RichText instance = object;
        return (    this.regexp == null
                 || this.regexp.length() == 0
                 || this.regexp_pattern == null
                 || (object != null && regexp_pattern.matcher(instance.getText(context) ).matches()));
    }

    static public FilterByRegExp_RichText_ newInstance(CallContext context) {
        return (FilterByRegExp_RichText_) Factory_Filter_RichText_.construct(context);
    }
}

