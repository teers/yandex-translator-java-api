/*
 * Copyright 2013 Robert Theis
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
package com.rmtheis.yandtran.language;

/**
 * Language - an enum of language codes supported by the Yandex API
 */
public enum Language {
  BULGARIAN("bg"),
  CZECH("cs"),
  ENGLISH("en"),
  FRENCH("fr"),
  GERMAN("de"),
  ITALIAN("it"),
  POLISH("pl"),
  PORTUGUESE("pt"),
  ROMANIAN("ro"),
  RUSSIAN("ru"),
  SERBIAN("sr"),
  SPANISH("es"),
  TURKISH("tr"),
  UKRAINIAN("uk");

  /**
   * String representation of this language.
   */
  private final String language;

  /**
   * Enum constructor.
   * @param pLanguage The language identifier.
   */
  private Language(final String pLanguage) {
    language = pLanguage;
  }

  public static Language fromString(final String pLanguage) {
    for (Language l : values()) {
      if (l.toString().equals(pLanguage)) {
        return l;
      }
    }
    return null;
  }

  /**
   * Returns the String representation of this language.
   * @return The String representation of this language.
   */
  @Override
  public String toString() {
    return language;
  }

}
