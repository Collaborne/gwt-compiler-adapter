gwt-compiler-adapter
====================

A simple wrapper for the standard compiler used by GWT to increase the logging.

See https://github.com/gwtproject/gwt/issues/4170#issuecomment-110767227 for the original idea and sources.

## Usage

1. Add the `gwt-compiler-adapter` dependency to `pom.xml`
   ~~~~
   <dependency>
     <groupId>com.collaborne.build</groupId>
     <artifactId>gwt-compiler-adapter</artifactId>
     <version>1.1</version>
     <scope>test</scope>
   </dependency>
   ~~~~
2. Add `-Dgwt.compiler=com.collaborne.build.gwt.GWTCompiler` to the VM arguments of the GWT SuperDevMode launcher

## License

    This software is licensed under the Apache 2 license, quoted below.

    Copyright 2015-2016 Collaborne B.V. <http://github.com/Collaborne/>

    Licensed under the Apache License, Version 2.0 (the "License"); you may not 
    use this file except in compliance with the License. You may obtain a copy of
    the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
    WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the 
    License for the specific language governing permissions and limitations under
    the License.

