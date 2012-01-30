/*
 * Copyright (C) 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android

package object divideandconquer {

  object AmbiguousDirection extends Enumeration {
    val Vertical, Horizonal, Unknown = Value
  }
  type AmbiguousDirection = AmbiguousDirection.Value

  /**
   * Either vertical or horizontal.  Used by animating lines and
   * ball regions.
   */
  object Direction extends Enumeration {
    val Vertical, Horizontal = Value
  }
  type Direction = Direction.Value
}
