// instantiated with javainst.pl from /workspace/sphenon/projects/components/basics/many/v0001/origin/source/java/com/sphenon/basics/many/templates/ReadOnlyVectorImplSingle.javatpl
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
import com.sphenon.basics.notification.*;
import com.sphenon.basics.customary.*;
import com.sphenon.basics.many.*;

import com.sphenon.basics.many.returncodes.*;

public class ReadOnlyVectorImplSingle_FileResource_long_
  implements ReadOnlyVector_FileResource_long_ {
    protected FileResource item;

    public ReadOnlyVectorImplSingle_FileResource_long_ (CallContext context, FileResource item) {
        this.item = item;
    }

    public FileResource get          (CallContext context, long index) throws DoesNotExist {
        if (index != 0) {
            DoesNotExist.createAndThrow (context);
            throw (DoesNotExist) null; // compiler insists
        }
        return item;
    }

    public FileResource tryGet       (CallContext context, long index) {
        if (index != 0) {
            return null;
        }
        return item;
    }

    public boolean  canGet       (CallContext context, long index) {
        return (index == 0 ? true : false);
    }

    public IteratorItemIndex_FileResource_long_ getNavigator (CallContext context) {
        return new VectorIteratorImpl_FileResource_long_ (context, this);
    }

    public VectorReferenceToMember_FileResource_long_ getReference (CallContext context, long index) throws DoesNotExist {
        if ( ! canGet(context, index)) {
            DoesNotExist.createAndThrow (context);
            throw (DoesNotExist) null; // compiler insists
        }
        return new VectorReferenceToMember_FileResource_long_(context, this, 0L);
    }

    public VectorReferenceToMember_FileResource_long_ tryGetReference (CallContext context, long index) {
        if ( ! canGet(context, index)) { return null; }
        return new VectorReferenceToMember_FileResource_long_(context, this, 0L);
    }

    public long     getSize      (CallContext context) {
        return 1;
    }
}
