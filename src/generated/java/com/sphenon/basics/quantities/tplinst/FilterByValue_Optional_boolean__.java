// instantiated with javainst.pl from /workspace/sphenon/projects/components/basics/retriever/v0001/origin/source/java/com/sphenon/basics/retriever/templates/FilterByValue.javatpl

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
import com.sphenon.basics.exception.*;
import com.sphenon.basics.retriever.*;

public class FilterByValue_Optional_boolean__ implements Filter_Optional_boolean__, FilterByValue  {

    public FilterByValue_Optional_boolean__ (CallContext context) {
        this.setFilterEnabled(context, false);
    }

    public FilterByValue_Optional_boolean__ (CallContext context, Optional_boolean_ value) {
        this.setValue(context, value);
    }

    public FilterByValue_Optional_boolean__ (CallContext context, Optional_boolean_... values) {
        this.setValues(context, values);
    }

    protected boolean filter_enabled;

    public boolean getFilterEnabled (CallContext context) {
        return this.filter_enabled;
    }

    public void setFilterEnabled (CallContext context, boolean filter_enabled) {
        this.filter_enabled = filter_enabled;
    }



    protected Optional_boolean_[] values;

    public Optional_boolean_ getValue (CallContext context) {
        return this.values == null || this.values.length != 1 ? null : this.values[0];
    }

    public void setValue (CallContext context, Optional_boolean_ value) {
        this.setValues(context, value);
    }

    public Optional_boolean_[] getValues (CallContext context) {
        return this.values;
    }

    public void setValues (CallContext context, Optional_boolean_... values) {
        this.setFilterEnabled(context, true);
        this.values = values;
    }

    public Object getValueAsObject (CallContext context) {
        return this.values != null && this.values.length == 1 ? this.values[0] : this.values;
    }

    public boolean matches (CallContext context, Optional_boolean_ object) {
        if (this.filter_enabled == false) { return true; }
        if (this.values != null) {
            if (object != null) {
                for (Optional_boolean_ value : values) {
                    if (object != null && ((value.getValue(context) == null && object.getValue(context) == null) || (value.getValue(context) != null && object.getValue(context) != null && (value.getValue(context)).booleanValue() == (object.getValue(context)).booleanValue()))) { return true; }
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
