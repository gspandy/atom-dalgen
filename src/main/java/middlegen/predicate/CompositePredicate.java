/*
 * Copyright (c) 2001, Aslak Hellesy, BEKK Consulting
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 * - Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 *
 * - Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * - Neither the name of BEKK Consulting nor the names of its
 *   contributors may be used to endorse or promote products derived from
 *   this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
 * DAMAGE.
 */
package middlegen.predicate;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Iterator;

import org.apache.commons.collections.Predicate;

/**
 * Baseclass for filters that contain other filters.
 *
 * @author <a href="aslak.hellesoy@bekk.no">Aslak Helles</a>
 * @created 18. august 2002
 */
public abstract class CompositePredicate extends AttributedPredicate {
   /**
    * @todo-javadoc Describe the field
    */
   private Collection _children;


   /**
    * Describe the method
    *
    * @todo-javadoc Write javadocs for method parameter
    * @todo-javadoc Describe the method
    * @todo-javadoc Describe the method parameter
    * @param predicate Describe what the parameter does
    */
   public void add(Predicate predicate) {
      if (_children == null) {
         _children = new LinkedList();
      }
      _children.add(predicate);
   }


   /**
    * Gets the Filters attribute of the CompositeFilter object
    *
    * @return The Filters value
    */
   protected Iterator getChildren() {
      if (_children == null) {
         _children = new LinkedList();
      }
      return _children.iterator();
   }
}
