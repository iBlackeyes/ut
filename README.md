# PowerMock

## mock 局部变量
XXX xxx = PowerMockito.mock(xxx.class);
whenNew(xxx.class).withAnyArgument().thenReturn(xxx)
doReturn(a).when(xxx).method();
doNothing().when(xxx).method();

## mock 静态方法
