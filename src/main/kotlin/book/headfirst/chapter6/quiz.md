# 쓰면서 제대로 공부하기

## P260
```
LightOffCommand lightOff = new LightOffCommand(light);
StereoOffCommand stereoOff = new StereoOffCommand(stereo);
TVOffCommand tvOff = new TVOffCommand(tv);
HottubOffCommand hottubOff = new HottubOffCommand(hottub);
```

## P262
```
for (int i = command.length-1; i>=0; i--) {
    commnad[i].undo();
}
```

## P265
* 클라이언트 - 
* 커맨드 - ButtonAngelListener, DevilListener
* 인보커 - Button
* 리시버 - System