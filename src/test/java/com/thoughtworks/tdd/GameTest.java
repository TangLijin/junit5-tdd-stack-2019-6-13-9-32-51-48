package com.thoughtworks.tdd;



import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class GameTest {



//    @Test
//    @DisplayName("try display name")
//    public void hello_world_test() {
//        //given
//        Dependency dependency = new Dependency();
//        HelloWorld helloWorld = new HelloWorld(dependency);
//        Game game = new Game(dependency);
//
//        //when
//        //String actual = helloWorld.beenCalled();
//        String actual = game.fizzBuzz(1);
//
//        //then
//        //assertThat(actual, is("Leave me alone."));
//        assertThat(actual,is("1"));
//    }

//    @Test
//    //public void should_be_mocked() {
//        //given
//        Dependency dependency = mock(Dependency.class);
//        when(dependency.say()).thenReturn("Hello World");
//        HelloWorld helloWorld = new HelloWorld(dependency);
//
//        //when
//        String actual = helloWorld.beenCalled();
//
//        //then
//        assertThat(actual, is("Hello World"));
//    }

    @Test
    public void should_return_1_when_call_fizzBuzz_given_1(){
//        //given
//        Dependency dependency = mock(Dependency.class);
//        when(dependency.fizzBuzz(1)).thenReturn("1");
//        Game game = new Game(dependency);
//
//        //when
//        String actual = game.fizzBuzz(1);
//
//        //then
//        assertThat(actual, is("1"));

//        Dependency dependency = new Dependency();
//        assertThat(dependency.fizzBuzz(1),is("1"));
        assertThat(new Game().fizzBuzz(1),is("1"));
    }
    @Test
    public void should_return_Fizz_when_call_fizzBuzz_given_3(){
        assertThat(new Game().fizzBuzz(3),is("Fizz"));
    }

    @Test
    public void should_return_Buzz_when_call_fizzBuzz_given_5(){
        assertThat(new Game().fizzBuzz(5),is("Buzz"));
    }

    @Test
    public void should_return_Whizz_when_call_fizzBuzz_given_7(){
        assertThat(new Game().fizzBuzz(7),is("Whizz"));
    }

    @Test
    public void should_return_Fizz_when_call_fizzBuzz_given_13(){
        assertThat(new Game().fizzBuzz(13),is("Fizz"));
    }
    @Test
    public void should_return_FizzBuzz_when_call_fizzBuzz_given_15(){
        assertThat(new Game().fizzBuzz(15),is("FizzBuzz"));
    }

    @Test
    public void should_return_FizzWhizz_when_call_fizzBuzz_given_21(){
        assertThat(new Game().fizzBuzz(21),is("FizzWhizz"));
    }

    @Test
    public void should_return_BuzzWhizz_when_call_fizzBuzz_given_35(){
        assertThat(new Game().fizzBuzz(35),is("BuzzWhizz"));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_call_fizzBuzz_given_105(){
        assertThat(new Game().fizzBuzz(105),is("FizzBuzzWhizz"));
    }
    
}



