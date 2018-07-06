package com.sphenon.basics.quantities;

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

import com.sphenon.basics.context.*;
import com.sphenon.basics.retriever.*;
import com.sphenon.basics.retriever.tplinst.*;
import com.sphenon.basics.factory.*;
import com.sphenon.basics.many.*;
import java.util.Date;
import com.sphenon.basics.validation.returncodes.*;
import com.sphenon.basics.locating.*;

import com.sphenon.basics.quantities.tplinst.*;

public class DataSlotImpl_Filter_Optional_Integer___
    extends DataSlotImpl_Filter_Optional_int___
    implements DataSlot_Filter_Optional_Integer___ {

    public DataSlotImpl_Filter_Optional_Integer___ (CallContext context) {
        super(context);
    }

    public DataSlotImpl_Filter_Optional_Integer___ (CallContext context, Filter_Optional_Integer__ data) {
        super(context, data);
    }

    public Filter_Optional_Integer__ get(CallContext context) {
        return (Filter_Optional_Integer__) super.get(context);
    }
}