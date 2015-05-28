/**
--| ADAPTIVE RUNTIME PLATFORM |----------------------------------------------------------------------------------------

(C) Copyright 2013-2015 Carlos Lozano Diez t/a Adaptive.me <http://adaptive.me>.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 . Unless required by appli-
-cable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,  WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the  License  for the specific language governing
permissions and limitations under the License.

Original author:

    * Carlos Lozano Diez
            <http://github.com/carloslozano>
            <http://twitter.com/adaptivecoder>
            <mailto:carlos@adaptive.me>

Contributors:

    * Ferran Vila Conesa
             <http://github.com/fnva>
             <http://twitter.com/ferran_vila>
             <mailto:ferran.vila.conesa@gmail.com>

    * See source code files for contributors.

Release:

    * @version v2.2.14

-------------------------------------------| aut inveniam viam aut faciam |--------------------------------------------
*/

package me.adaptive.arp.api;

import java.io.Serializable;

/**
   Structure representing the assigned tags data elements of a contact.

   @author Francisco Javier Martin Bueno
   @since v2.0
   @version 1.0
*/
public class ContactTag extends APIBean implements Serializable {

     /**
        Java serialization support.
        @since 2.2.13
     */
     private static final long serialVersionUID = 100290547L;

     /**
        The tagName of the Tag
     */
     private String tagName;
     /**
        The tagValue of the Tag
     */
     private String tagValue;

     /**
        Default constructor

        @since v2.0
     */
     public ContactTag() {
     }

     /**
        Constructor used by the implementation

        @param tagValue Value of the tag
        @param tagName  Name of the tag
        @since v2.0
     */
     public ContactTag(String tagName, String tagValue) {
          super();
          this.tagName = tagName;
          this.tagValue = tagValue;
     }

     /**
        Returns the tagName of the Tag

        @return tagName
        @since v2.0
     */
     public String getTagName() {
          return this.tagName;
     }

     /**
        Set the tagName of the Tag

        @param tagName Name of the tag
        @since v2.0
     */
     public void setTagName(String tagName) {
          this.tagName = tagName;
     }

     /**
        Returns the tagValue of the Tag

        @return tagValue
        @since v2.0
     */
     public String getTagValue() {
          return this.tagValue;
     }

     /**
        Set the tagValue of the Tag

        @param tagValue Value of the tag
        @since v2.0
     */
     public void setTagValue(String tagValue) {
          this.tagValue = tagValue;
     }


}

/**
------------------------------------| Engineered with ♥ in Barcelona, Catalonia |--------------------------------------
*/
