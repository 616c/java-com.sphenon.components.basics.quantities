// instantiated with javainst.pl from /workspace/sphenon/projects/components/basics/many/v0001/origin/source/java/com/sphenon/basics/many/templates/VectorIterable.javatpl
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

public class VectorIterable_FileResource_long_ implements Iterable<FileResource>
{
    protected java.util.Iterator<FileResource> iterator;

    public VectorIterable_FileResource_long_ (CallContext context, Vector_FileResource_long_ vector) {
        this.iterator = (vector == null ? (new java.util.Vector<FileResource>()).iterator() : vector.getIterator_FileResource_(context));
    }

    public java.util.Iterator<FileResource> iterator () {
        return this.iterator;
    }
}

