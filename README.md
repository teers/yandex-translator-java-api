#apertium-translator-java-api
* * *

Provides a Java wrapper around the Apertium machine translation web service API. 

Currently, only the service for translating a single string is implemented in this API. The translate service is not implemented for an array of strings, and the listPairs service is not implemented.

This project was forked from the microsoft-translator-java-api project by Jonathan Griggs.

## Requires

* An Apertium API Key - [Sign Up Here](http://api.apertium.org/register.jsp)

Quickstart
==========

Download the latest [JAR with Dependencies](https://github.com/downloads/rmtheis/apertium-translator-java-api/apertium-translator-java-api-0.1-jar-with-dependencies.jar)

    import com.robtheis.aptr.language.Language;
    import com.robtheis.aptr.translate.Translate;

    public class Main {
      public static void main(String[] args) throws Exception {
        // Set the Apertium API Key - Get yours at http://api.apertium.org/register.jsp
        Translate.setKey(/* Put your Apertium API Key here */);

        String translatedText = Translate.execute("Hola, mundo!", Language.SPANISH, Language.ENGLISH);

        System.out.println(translatedText);
      }
    }

License
=======

The apertium-translator-java-api is licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

    /*
     * Copyright 2011 Jonathan Griggs.
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
