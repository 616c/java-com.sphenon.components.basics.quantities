// instantiated with javainst.pl from /workspace/sphenon/projects/components/basics/many/v0001/origin/source/java/com/sphenon/basics/many/templates/Vector.javatpl

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

import com.sphenon.basics.many.*;
import com.sphenon.basics.many.returncodes.*;

import com.sphenon.ui.annotations.*;

@UIId("")
@UIName("")
@UIClassifier("Vector_Image_")
@UIParts("js:instance.getIterable(context)")
public interface Vector_Image_long_
  extends ReadOnlyVector_Image_long_,
          WriteVector_Image_long_
          , GenericVector<Image>
          , GenericIterable<Image>
{
    public Image                                    get             (CallContext context, long index) throws DoesNotExist;
    public Image                                    tryGet          (CallContext context, long index);
    public boolean                                     canGet          (CallContext context, long index);

    public ReferenceToMember_Image_long_ReadOnlyVector_Image_long__  getReference    (CallContext context, long index) throws DoesNotExist;
    public ReferenceToMember_Image_long_ReadOnlyVector_Image_long__  tryGetReference (CallContext context, long index);

    public Image                                    set             (CallContext context, long index, Image item);
    public void                                        add             (CallContext context, long index, Image item) throws AlreadyExists;
    public void                                        prepend         (CallContext context, Image item);
    public void                                        append          (CallContext context, Image item);
    public void                                        insertBefore    (CallContext context, long index, Image item) throws DoesNotExist;
    public void                                        insertBehind    (CallContext context, long index, Image item) throws DoesNotExist;
    public Image                                    replace         (CallContext context, long index, Image item) throws DoesNotExist;
    public Image                                    unset           (CallContext context, long index);
    public Image                                    remove          (CallContext context, long index) throws DoesNotExist;

    public IteratorItemIndex_Image_long_       getNavigator    (CallContext context);

    public long                                        getSize         (CallContext context);

    // for sake of Iterable's
    public java.util.Iterator<Image>              getIterator_Image_ (CallContext context);
    public java.util.Iterator                          getIterator (CallContext context);
    public VectorIterable_Image_long_          getIterable_Image_ (CallContext context);
    public Iterable<Image> getIterable (CallContext context);
}
