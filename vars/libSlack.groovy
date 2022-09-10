def call(Map config = [:]){
  switch (config.operationName){
    case "callMehod1":
      """ 
        ls
        ll
        ls
      """
      break;
    case "callMehod2":
      echo "called method2"
      break;
    case "callMehod3":
      echo "called method3"
      break;
  }
}