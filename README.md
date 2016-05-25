# Servi Entrega Java SDK

# Doc API

**WSDL to be used on Tracking**

http://sismilenio.servientrega.com/wsrastreoenvios/wsRastreoEnvios.asmx?wsdl

# To generate a stuble classes 

```bash
$ wsimport -s src -keep http://sismilenio.servientrega.com/wsrastreoenvios/wsRastreoEnvios.asmx?wsdl
```

May happens the following warning

```bash
[WARNING] warning: part Body is ignored, either the "element" or the "type" attribute is required in part "Body"
```

To fix it out, we must use the following 

```bash
$ wsimport -s src -keep -b http://www.w3.org/2001/XMLSchema.xsd http://sismilenio.servientrega.com/wsrastreoenvios/wsRastreoEnvios.asmx?wsdl
```

Note that we are using the argument **-b** with the value **http://www.w3.org/2001/XMLSchema.xsd** to indicate that wsimport must use an additional schema

After that you may also have another error, as shows bellow

```bash
org.xml.sax.SAXParseException; systemId: http://www.w3.org/2001/XMLSchema.xsd; lineNumber: 67; columnNumber: 11; External DTD: Failed to read external DTD 'XMLSchema.dtd', because 'http' access is not allowed due to restriction set by the accessExternalDTD property.
	at com.sun.org.apache.xerces.internal.parsers.AbstractSAXParser.parse(AbstractSAXParser.java:1239)
	at com.sun.org.apache.xerces.internal.jaxp.SAXParserImpl$JAXPSAXParser.parse(SAXParserImpl.java:643)
	at com.sun.tools.internal.xjc.reader.internalizer.DOMForest.parse(DOMForest.java:379)
	at com.sun.tools.internal.xjc.reader.internalizer.DOMForest.parse(DOMForest.java:259)
	at com.sun.tools.internal.xjc.api.impl.s2j.SchemaCompilerImpl.parseSchema(SchemaCompilerImpl.java:143)
	at com.sun.tools.internal.ws.processor.modeler.wsdl.JAXBModelBuilder.internalBuildJAXBModel(JAXBModelBuilder.java:101)
	at com.sun.tools.internal.ws.processor.modeler.wsdl.JAXBModelBuilder.<init>(JAXBModelBuilder.java:66)
	at com.sun.tools.internal.ws.processor.modeler.wsdl.WSDLModeler.buildJAXBModel(WSDLModeler.java:2267)
	at com.sun.tools.internal.ws.processor.modeler.wsdl.WSDLModeler.internalBuildModel(WSDLModeler.java:183)
	at com.sun.tools.internal.ws.processor.modeler.wsdl.WSDLModeler.buildModel(WSDLModeler.java:126)
	at com.sun.tools.internal.ws.wscompile.WsimportTool.buildWsdlModel(WsimportTool.java:429)
	at com.sun.tools.internal.ws.wscompile.WsimportTool.run(WsimportTool.java:190)
	at com.sun.tools.internal.ws.wscompile.WsimportTool.run(WsimportTool.java:168)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.sun.tools.internal.ws.Invoker.invoke(Invoker.java:159)
	at com.sun.tools.internal.ws.WsImport.main(WsImport.java:42)
Exception in thread "main" java.lang.NullPointerException
	at com.sun.tools.internal.xjc.reader.internalizer.DOMForest.weakSchemaCorrectnessCheck(DOMForest.java:450)
	at com.sun.tools.internal.xjc.api.impl.s2j.SchemaCompilerImpl.bind(SchemaCompilerImpl.java:245)
	at com.sun.tools.internal.xjc.api.impl.s2j.SchemaCompilerImpl.bind(SchemaCompilerImpl.java:80)
	at com.sun.tools.internal.ws.processor.modeler.wsdl.JAXBModelBuilder.bind(JAXBModelBuilder.java:127)
	at com.sun.tools.internal.ws.processor.modeler.wsdl.WSDLModeler.buildJAXBModel(WSDLModeler.java:2283)
	at com.sun.tools.internal.ws.processor.modeler.wsdl.WSDLModeler.internalBuildModel(WSDLModeler.java:183)
	at com.sun.tools.internal.ws.processor.modeler.wsdl.WSDLModeler.buildModel(WSDLModeler.java:126)
	at com.sun.tools.internal.ws.wscompile.WsimportTool.buildWsdlModel(WsimportTool.java:429)
	at com.sun.tools.internal.ws.wscompile.WsimportTool.run(WsimportTool.java:190)
	at com.sun.tools.internal.ws.wscompile.WsimportTool.run(WsimportTool.java:168)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.sun.tools.internal.ws.Invoker.invoke(Invoker.java:159)
	at com.sun.tools.internal.ws.WsImport.main(WsImport.java:42)
```

Note that we are not allowed to access an external resource, as showed on the message

```bash
because 'http' access is not allowed due to restriction set by the accessExternalDTD property.
```

To solve that, if you are using maven, you can configurate it to access external resources, as follow

```xml
<plugin>
  <groupId>org.jvnet.jax-ws-commons</groupId>
  <artifactId>jaxws-maven-plugin</artifactId>
  <version>2.3</version>
  <configuration>
    <!-- Needed with JAXP 1.5 -->
    <vmArgs>
        <vmArg>-Djavax.xml.accessExternalSchema=all</vmArg>
    </vmArgs>
  </configuration>
</plugin>
```

But if you are using wsimport, you may to follow the steps

- Go into /Library/Java/JavaVirtualMachines/jdk1.8.0_91.jdk/Contents/Home/jre/lib directory

- Create a file named **jaxb.properties**

- Put the content

```bash
javax.xml.accessExternalDTD = all
```

And all will work! Try the command again:

```bash
$ wsimport -s src -keep -b http://www.w3.org/2001/XMLSchema.xsd http://sismilenio.servientrega.com/wsrastreoenvios/wsRastreoEnvios.asmx?wsdl
```

Ok, you don't like to change Java lib folder and you are trying just to import a wsdl from Eclipse. Ok, you can configure Eclipse to allow external access using the following configuration on **Eclipse Settings "External Tools Configurations"** and add the following to the VM arguments for the build configuration:

```bash
-Djavax.xml.accessExternalSchema=all
```
Voilà!

You will notice that everything works fine \o/ (I really hope! :P)



