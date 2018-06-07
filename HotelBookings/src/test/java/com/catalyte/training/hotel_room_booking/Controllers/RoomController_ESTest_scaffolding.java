/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Jun 05 22:31:38 GMT 2018
 */

package com.catalyte.training.hotel_room_booking.Controllers;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class RoomController_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.catalyte.training.hotel_room_booking.Controllers.RoomController"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "Cp1252"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\begley\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "C:\\Users\\begley\\Desktop\\PDX18-2-begley_hotel_booking\\HotelBookings"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\begley"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "begley"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RoomController_ESTest_scaffolding.class.getClassLoader() ,
      "org.springframework.data.domain.ExampleMatcher$PropertySpecifier",
      "com.catalyte.training.hotel_room_booking.CustomExceptions.RoomNotFound",
      "org.springframework.http.HttpStatus$Series",
      "org.springframework.web.bind.annotation.RequestMapping",
      "org.springframework.beans.factory.annotation.Autowired",
      "com.catalyte.training.hotel_room_booking.Entities.Room",
      "org.springframework.stereotype.Controller",
      "org.springframework.data.repository.CrudRepository",
      "org.springframework.data.repository.NoRepositoryBean",
      "org.springframework.data.domain.Sort$Direction",
      "org.springframework.data.domain.ExampleMatcher$MatchMode",
      "org.springframework.data.domain.ExampleMatcher$PropertySpecifiers",
      "org.springframework.data.repository.Repository",
      "org.springframework.data.domain.Sort",
      "org.springframework.data.domain.Pageable",
      "io.swagger.annotations.AuthorizationScope",
      "org.springframework.stereotype.Indexed",
      "io.swagger.annotations.Api",
      "org.springframework.web.bind.annotation.ResponseStatus",
      "org.springframework.data.mongodb.repository.MongoRepository",
      "org.springframework.data.domain.ExampleMatcher$GenericPropertyMatcher",
      "com.catalyte.training.hotel_room_booking.CustomExceptions.RoomTypeFull",
      "org.springframework.data.repository.PagingAndSortingRepository",
      "org.springframework.web.bind.annotation.RequestMethod",
      "org.springframework.data.domain.ExampleMatcher",
      "org.springframework.data.domain.Page",
      "org.springframework.data.domain.Example",
      "org.springframework.web.bind.annotation.ResponseBody",
      "org.springframework.web.bind.annotation.RestController",
      "org.springframework.data.domain.Sort$Order",
      "org.springframework.data.domain.Slice",
      "org.springframework.data.domain.Sort$NullHandling",
      "org.springframework.data.repository.query.QueryByExampleExecutor",
      "org.springframework.http.HttpStatus",
      "org.springframework.data.domain.ExampleMatcher$PropertyValueTransformer",
      "org.springframework.data.domain.ExampleMatcher$NoOpPropertyValueTransformer",
      "org.springframework.stereotype.Component",
      "org.springframework.data.domain.ExampleMatcher$MatcherConfigurer",
      "org.springframework.data.util.Streamable",
      "org.springframework.data.domain.ExampleMatcher$StringMatcher",
      "org.springframework.data.domain.TypedExampleMatcher",
      "com.catalyte.training.hotel_room_booking.Controllers.RoomController",
      "io.swagger.annotations.Authorization",
      "org.springframework.data.domain.ExampleMatcher$NullHandler",
      "org.springframework.data.domain.ExampleMatcher$GenericPropertyMatchers",
      "com.catalyte.training.hotel_room_booking.Repositories.RoomRepository",
      "org.springframework.web.bind.annotation.Mapping",
      "org.springframework.util.Assert"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.catalyte.training.hotel_room_booking.Repositories.RoomRepository", false, RoomController_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RoomController_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.catalyte.training.hotel_room_booking.Controllers.RoomController",
      "org.springframework.web.bind.annotation.RequestMethod",
      "com.catalyte.training.hotel_room_booking.Entities.Room",
      "org.springframework.util.Assert",
      "org.springframework.data.domain.Sort",
      "com.catalyte.training.hotel_room_booking.CustomExceptions.RoomNotFound",
      "com.catalyte.training.hotel_room_booking.CustomExceptions.RoomTypeFull",
      "org.springframework.data.domain.TypedExampleMatcher",
      "org.springframework.data.domain.ExampleMatcher$NullHandler",
      "org.springframework.data.domain.ExampleMatcher$StringMatcher",
      "org.springframework.data.domain.ExampleMatcher$PropertySpecifiers",
      "org.springframework.data.domain.ExampleMatcher$MatchMode"
    );
  }
}
