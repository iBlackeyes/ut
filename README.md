# PowerMock

## mock 局部变量
XXX xxx = PowerMockito.mock(xxx.class);
whenNew(xxx.class).withAnyArgument().thenReturn(xxx)
doReturn(a).when(xxx).method();
doNothing().when(xxx).method();

## mock 静态方法


### mock static void method
@PrepareForTest({xxxx.class})

PowerMockito.mockStatic(xxx.classs)
PowerMockito.doNothing.when(xxx.class)
xxxx.method(any(xxx), any(xxx))
