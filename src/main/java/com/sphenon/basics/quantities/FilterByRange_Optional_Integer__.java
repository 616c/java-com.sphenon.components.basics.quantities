package com.sphenon.basics.quantities;

/****************************************************************************
  Copyright 2001-2024 Sphenon GmbH

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
import com.sphenon.basics.exception.*;
import com.sphenon.basics.retriever.*;
import com.sphenon.basics.retriever.*;
import com.sphenon.basics.retriever.tplinst.*;
import com.sphenon.basics.factory.*;
import com.sphenon.basics.many.*;
import java.util.Date;
import com.sphenon.basics.validation.returncodes.*;
import com.sphenon.basics.locating.*;

import com.sphenon.basics.quantities.tplinst.*;

public class FilterByRange_Optional_Integer__ extends FilterByRange_Optional_int__ implements Filter_Optional_Integer__ {

    public FilterByRange_Optional_Integer__ (CallContext context) {
        super(context);
    }

    public FilterByRange_Optional_Integer__ (CallContext context, Integer minimum, Integer maximum) {
        super(context, minimum, maximum);
    }

    public boolean matches (CallContext context, Optional_Integer_ object) {
        return super.matches(context, object);
    }
}
