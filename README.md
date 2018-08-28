[![](https://jitpack.io/v/Young-Gon/CLogSample.svg)](https://jitpack.io/#Young-Gon/CLogSample)
# CLogSample #

로그켓의 Tag항목에 로그가 작성된 위치를 표시해 줍니다. 또한 그 항목으로 바로 갈수 있는 링크도 제공 되기 때문에 빠르게 소스 코드 상에서 로그를 찾아
갈수 있도록 해줍니다

# 예시 #
```java
CLog.d("한줄평 추가");
```

![capture](/capture_CLog.png)

# 사용법 #
릴리즈시 로그를 남기지 않도록 **CLog**와 **CLog-Debug** 두개의 라이브러리가 있습니다
* CLog-Debug
  실제 로그가 출력되는 코드가 들어 있는 라이브러리입니다 - 우리가 사용해야할 라이브러리
  
* CLog
  아무 기능을 하지 않는 빈 CLog 클레스가 들어 있는 라이브러리입니다
  
다음과 같이 디버그시에는 **CLog-Debug**를 사용하고, 릴리즈 시에는 **CLog** 라이브러리를 사용하도록 설정하시면 됩니다


```gradle
allprojects {
    repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}
```

```gradle
dependencies {
    releaseImplementation 'com.github.Young-Gon:CLogSample:0.1'
    debugImplementation 'com.github.Young-Gon:CLogSample:0.1-debug'
}
```
