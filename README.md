### What version of the library are you using?
```
2.9.2
```

### What kind of issue is this?
```
Bug
```

### Example Repository

https://github.com/napolev/springfox-swagger2-issue

### How to recreate the issue
```
$ git clone https://github.com/napolev/springfox-swagger2-issue
$ cd springfox-swagger2-issue
$ gradle bootRun
```

### Description of the issue

On the repository pointed above there is a very simple project which contains the following file:

**/src/main/java/com/example/demo/car/CarController.java**

![Preview](https://i.ibb.co/MMdnnZz/image-3.png)

The issue is that the [@ExampleProperty / value](https://github.com/napolev/springfox-swagger2-issue/blob/master/src/main/java/com/example/demo/car/CarController.java#L43) is getting ignored as you can see on the image below:

![Preview](https://i.ibb.co/jvTj6Sw/image-2.png)

Other than that, everything works fine. For example, if I specify the following payload, the response is correct:

![Preview](https://i.ibb.co/dWtz21g/image.png)
