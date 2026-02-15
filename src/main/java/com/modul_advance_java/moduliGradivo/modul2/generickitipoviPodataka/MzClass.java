package com.modul_advance_java.moduliGradivo.modul2.generickitipoviPodataka;

//sada smo uveli ogranicenje za parametrizaciju
//T extends Number
// to znaci da ce MzClass moci biti parametrizovan samo sa klasama koje imaju za vrednost brojeve
//moguca parametrizacija sa Integer,Double...
public class MzClass<T extends Number> {
    public T t;

}
