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
import com.sphenon.basics.exception.*;
import com.sphenon.basics.customary.*;

public class VersionNumber {

    static public String format = "^(d?[0-9]+)?(\\.d?[0.9]+)*$";

    public VersionNumber(CallContext context, String number) {
        this.number = number;
        if (this.number == null) {
            this.number = "";
        }
        if (number.matches(format) == false) {
            CustomaryContext.create((Context)context).throwPreConditionViolation(context, "Version number has invalid format: '%(number)', expected '%(format)'", "number", this.number, "format", format);
            throw (ExceptionPreConditionViolation) null; // compiler insists
        }
    }

    protected String number;

    public String getNumber (CallContext context) {
        return this.number;
    }

    public void setNumber (CallContext context, String number) {
        this.number = number;
    }

    public int compareTo(CallContext context, VersionNumber other) {
        return compare(context, this.number, other.number);
    }

    static public int compare(CallContext context, String number1, String number2) {
        String[] n1 = number1.split("\\.",2);
        String[] n2 = number2.split("\\.",2);
        int i1 = 0;
        if (n1[0].length() > 0) {
            if (n1[0].charAt(0) == 'd') {
                i1 = Integer.parseInt(n1[0].substring(1)) * 10 - 5;
            } else {
                i1 = Integer.parseInt(n1[0].substring(1)) * 10;
            }
        }
        int i2 = 0;
        if (n2[0].length() > 0) {
            if (n2[0].charAt(0) == 'd') {
                i2 = Integer.parseInt(n2[0].substring(1)) * 10 - 5;
            } else {
                i2 = Integer.parseInt(n2[0].substring(1)) * 10;
            }
        }
        return   i1 < i2 ? -1
               : i2 < i1 ? 1
               : (   n1.length == 1 && n2.length == 1 ? 0
                     : compare(context, n1.length == 1 ? "" : n1[1], n2.length == 1 ? "" : n2[1])
                 );
    }
}
