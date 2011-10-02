/*
 * apertium-translator-java-api
 * 
 * Copyright 2011 Robert Theis
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
package com.robtheis.aptr.test;

import com.robtheis.aptr.language.Language;
import com.robtheis.aptr.translate.Translate;

public class TranslateTest {
  private static final String API_KEY = ""; // Put your Apertium API key here.
  
  public static void main(String[] args) {
    try {
      Translate.setKey(API_KEY);
      String translation = Translate.execute("The quick brown fox jumps over the lazy dog.", Language.ENGLISH, Language.SPANISH);
      System.out.println("Translation: " + translation);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}