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

public class DataTraits_UUID implements DataTraits<UUID>
{
    public DataTraits_UUID(CallContext context) {
    }

    static protected DataTraits_UUID singleton;

    static public DataTraits_UUID get(CallContext context) {
        if (singleton == null) {
            singleton = new DataTraits_UUID(context);
        }
        return singleton;
    }

    public Class getHandledClass(CallContext context) {
        return java.util.UUID.class;
    }

    public Variative_String_ convertToPresentationVariativeString (CallContext context, UUID value) {
        return VariativeStringTrivial.create(context, convertToPresentationString(context, value));
    }

    public String convertToPresentationString (CallContext context, UUID value) {
        return (value == null ? "" : SystemUtilities.getUUIDHex(context, false, true, false, 0, value));
    }

    public UUID convertFromPresentationString (CallContext context, String text) throws DataConversionFailure {
        if (text == null || text.trim().length() == 0) { return null; }
        try {
            return SystemUtilities.getUUID(context, text.toString());
        } catch (Throwable t) {
            DataConversionFailure.createAndThrow(context, t, "Invalid UUID format '%(text)'", "text", text);
            throw (DataConversionFailure) null;
        }
    }

    public String convertToRESTServiceString (CallContext context, UUID ad_value) {
        return (ad_value == null ? null : SystemUtilities.getUUIDHex(context, true, false, false, 0, ad_value));
    }

    public UUID convertFromRESTServiceString (CallContext context, String rest_value) {
        return (rest_value == null ? null : (com.sphenon.basics.system.SystemUtilities.getUUID(context, rest_value)));
    }
}
