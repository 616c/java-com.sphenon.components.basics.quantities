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

public class Point_int_ implements Point {
    protected int[] coordinates;

    public Point_int_ (CallContext context) {
    }

    public Point_int_ (CallContext context, int[] coordinates) {
        this.coordinates = coordinates;
    }

    public Point_int_ (CallContext context, int c0) {
        this.coordinates = new int[1];
        this.coordinates[0] = c0;
    }

    public Point_int_ (CallContext context, int c0, int c1) {
        this.coordinates = new int[2];
        this.coordinates[0] = c0;
        this.coordinates[1] = c1;
    }

    public Point_int_ (CallContext context, int c0, int c1, int c2) {
        this.coordinates = new int[3];
        this.coordinates[0] = c0;
        this.coordinates[1] = c1;
        this.coordinates[2] = c2;
    }

    public int[] getCoordinates(CallContext context) {
        return this.coordinates;
    }

    public void setCoordinates(CallContext context, int[] coordinates) {
        this.coordinates = coordinates;
    }
}
