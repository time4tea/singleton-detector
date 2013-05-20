/*
 * Copyright 2007 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.singletondetector.p1;

import com.google.singletondetector.p2.NotASingletonTwo;

public class NotAFingleton {
  public static final int REF = 12;

  private static final NotASingletonTwo FINGLE = new NotASingletonTwo();

  public NotAFingleton() {
    // Do nothing, but use FINGLE
    FINGLE.getClass();
  }
}
