// instantiated with javainst.pl from /workspace/sphenon/projects/components/basics/many/v0001/origin/source/java/com/sphenon/basics/many/templates/WriteVector.javatpl
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

import com.sphenon.basics.many.returncodes.*;

public interface WriteVector_Image_long_
{
    public Image set          (CallContext context, long index, Image item);
    public void     add          (CallContext context, long index, Image item) throws AlreadyExists;
    public void     prepend      (CallContext context, Image item);
    public void     append       (CallContext context, Image item);
    public void     insertBefore (CallContext context, long index, Image item) throws DoesNotExist;
    public void     insertBehind (CallContext context, long index, Image item) throws DoesNotExist;
    public Image replace      (CallContext context, long index, Image item) throws DoesNotExist;
    public Image unset        (CallContext context, long index);
    public Image remove       (CallContext context, long index) throws DoesNotExist;
}

