package Model;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Stack;

public class CareTaker {

        private final Stack<Memento> mementos = new Stack<>();


        public void addMemento(Memento memento) {

            mementos.add(memento);

        }

        public int size(){

            return mementos.size();
        }

        public Memento getMemento() {

            if (!mementos.isEmpty()) {
                return mementos.pop();
            }
            return null;
        }


    }


