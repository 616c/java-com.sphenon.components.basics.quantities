// instantiated with javainst.pl from /workspace/sphenon/projects/components/basics/many/v0001/origin/source/java/com/sphenon/basics/many/templates/Vector.javatpl
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

import com.sphenon.basics.many.*;
import com.sphenon.basics.many.returncodes.*;

import com.sphenon.ui.annotations.*;

@UIId("")
@UIName("")
@UIClassifier("Vector_RichText_")
@UIParts("js:instance.getIterable(context)")
public interface Vector_RichText_long_
  extends ReadOnlyVector_RichText_long_,
          WriteVector_RichText_long_
          , GenericVector<RichText>
          , GenericIterable<RichText>
{
    public RichText                                    get             (CallContext context, long index) throws DoesNotExist;
    public RichText                                    tryGet          (CallContext context, long index);
    public boolean                                     canGet          (CallContext context, long index);

    public ReferenceToMember_RichText_long_ReadOnlyVector_RichText_long__  getReference    (CallContext context, long index) throws DoesNotExist;
    public ReferenceToMember_RichText_long_ReadOnlyVector_RichText_long__  tryGetReference (CallContext context, long index);

    public RichText                                    set             (CallContext context, long index, RichText item);
    public void                                        add             (CallContext context, long index, RichText item) throws AlreadyExists;
    public void                                        prepend         (CallContext context, RichText item);
    public void                                        append          (CallContext context, RichText item);
    public void                                        insertBefore    (CallContext context, long index, RichText item) throws DoesNotExist;
    public void                                        insertBehind    (CallContext context, long index, RichText item) throws DoesNotExist;
    public RichText                                    replace         (CallContext context, long index, RichText item) throws DoesNotExist;
    public RichText                                    unset           (CallContext context, long index);
    public RichText                                    remove          (CallContext context, long index) throws DoesNotExist;

    public IteratorItemIndex_RichText_long_       getNavigator    (CallContext context);

    public long                                        getSize         (CallContext context);

    // for sake of Iterable's
    public java.util.Iterator<RichText>              getIterator_RichText_ (CallContext context);
    public java.util.Iterator                          getIterator (CallContext context);
    public VectorIterable_RichText_long_          getIterable_RichText_ (CallContext context);
    public Iterable<RichText> getIterable (CallContext context);
}
