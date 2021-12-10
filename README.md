# TwoNumAdditionLibrary
two number addition simple library just for practicing.
>Step 1. Add the JitPack repository to your build file
>>Add it in your root build.gradle at the end of repositories:

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  
  >Step 2. Add the dependency and add latest version instead of Tag
  
  ```
  dependencies {
	        implementation 'com.github.SarfarazAliToori:TwoNumAdditionLibrary:Tag'
	}
  
 ```
 
 ```
 [![](https://jitpack.io/v/SarfarazAliToori/TwoNumAdditionLibrary.svg)](https://jitpack.io/#SarfarazAliToori/TwoNumAdditionLibrary)
```

>How to use

```
val addition = Addition()
        val sum = addition.input(20, 20)

        val a =  addition.threeNumAddition(10, 20, 30)
        val b =  addition.twoNumAddition(2, 4)
        val c =  addition.twoNumberDivision(10,5)
        val d =  addition.twoNumberMultiplication(6, 2)
```

