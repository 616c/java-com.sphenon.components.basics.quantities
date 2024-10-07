package com.sphenon.basics.quantities.traits;

import com.sphenon.basics.context.*;
import com.sphenon.basics.notification.*;
import com.sphenon.basics.customary.*;
import com.sphenon.basics.exception.*;
import com.sphenon.basics.system.*;
import com.sphenon.basics.variatives.*;
import com.sphenon.basics.variatives.classes.*;
import com.sphenon.basics.variatives.tplinst.*;
import com.sphenon.basics.data.conversion.returncodes.*;

import java.text.*;
import java.util.UUID;

public interface DataTraits<T> {

    public Class             getHandledClass(CallContext context);

    public Variative_String_ convertToPresentationVariativeString (CallContext context, T value);
    public String            convertToPresentationString (CallContext context, T value);
    public T                 convertFromPresentationString (CallContext context, String text) throws DataConversionFailure;
}
