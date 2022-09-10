def call(String operationName, Map config = [:]){
  switch (operationName){
    case "callMehod1":
      echo "called method1"
      break;
    case "callMehod2":
      echo "called method2"
      break;
    case "callMehod3":
      echo "called method3"
      break;
  }
}