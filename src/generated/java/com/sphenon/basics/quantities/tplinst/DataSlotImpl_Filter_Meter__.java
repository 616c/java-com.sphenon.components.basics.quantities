// instantiated with javainst.pl from /workspace/sphenon/projects/components/basics/smallparts/v0001/origin/source/java/com/sphenon/basics/smallparts/templates/DataSlotImpl.javatpl

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

public class DataSlotImpl_Filter_Meter__
    implements DataSlot_Filter_Meter__ {

    Filter_Meter_ data;

    public DataSlotImpl_Filter_Meter__ (CallContext context) {
    }

    public DataSlotImpl_Filter_Meter__ (CallContext context, Filter_Meter_ data) {
        this.data = data;
    }

    public void set(CallContext context, Filter_Meter_ data) {
        this.data = data;
    }

    public void setObject(CallContext context, Object data) {
        set(context, (Filter_Meter_)data);
    }

    public Filter_Meter_ get(CallContext context) {
        return this.data;
    }

    public Object getObject(CallContext context) {
        return get(context);
    }
}
