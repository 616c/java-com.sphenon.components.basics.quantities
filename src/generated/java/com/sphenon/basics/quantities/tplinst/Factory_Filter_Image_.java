// instantiated with javainst.pl from /workspace/sphenon/projects/components/basics/retriever/v0001/origin/source/java/com/sphenon/basics/retriever/templates/Factory_Filter.javatpl
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
import com.sphenon.basics.context.classes.*;
import com.sphenon.basics.exception.*;
import com.sphenon.basics.configuration.*;
import com.sphenon.basics.customary.*;
import com.sphenon.basics.retriever.*;
import com.sphenon.basics.factory.*;

public class Factory_Filter_Image_ {

    /* -------------- extensible factory instantiation --------------------------------------------------------------------------------------- */
    static protected Configuration config;
    static protected FactoryInstantiator<Factory_Filter_Image_> factory_instantiator;
    static {
      CallContext context = RootContext.getInitialisationContext();
      config = Configuration.create(context, "--__Package__--.Factory_Filter_Image_");
      factory_instantiator = new FactoryInstantiator(context, Factory_Filter_Image_.class) { protected Factory_Filter_Image_ createDefault(CallContext context) { return new Factory_Filter_Image_(context); } };
    };
    /* --------------------------------------------------------------------------------------------------------------------------------------- */
    static public Factory_Filter_Image_ newInstance (CallContext context) {
        return factory_instantiator.newInstance(context);
    }
    /* --------------------------------------------------------------------------------------------------------------------------------------- */

    static public Filter_Image_ construct (CallContext context) {
        return newInstance(context).create(context);
    }

    protected Factory_Filter_Image_ (CallContext context) {
    }

    public Filter_Image_ create (CallContext context) {
        FilterByRegExp_Image_ filter = new FilterByRegExp_Image_(context);
filter.setExpression(context, this.expression);
        return filter;
    }

    static public Filter_Image_ construct (CallContext context, String expression) {
        return newInstance(context).create(context, expression);
    }

    public Filter_Image_ create (CallContext context, String expression) {
        return new FilterByRegExp_Image_(context, expression);
    }
protected String expression; public String getExpression (CallContext context) { return this.expression; } public String defaultExpression (CallContext context) { return null; } public void setExpression (CallContext context, String expression) { this.expression = expression; }
}
