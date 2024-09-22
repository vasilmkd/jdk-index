/*
 * Copyright 2021-2023 Typelevel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.typelevel.jdk.index.model

enum Version(string: String):
  case JDK_23 extends Version("23")
  case JDK_22 extends Version("22")
  case JDK_21 extends Version("21")
  case JDK_17 extends Version("17")
  case JDK_11 extends Version("11")
  case JDK_8 extends Version("8")

  override def toString: String = string
