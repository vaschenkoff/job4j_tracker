package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder even = new StringBuilder();
        int size = evenElements.size();
        for (int i = 0; i < size / 2; i++) {
            even.append(evenElements.poll());
            evenElements.poll();
        }
        return String.valueOf(even);
    }

    private String getDescendingElements() {
        StringBuilder descend = new StringBuilder();
        int size = descendingElements.size();
        for (int i = 0; i < size; i++) {
            descend.append(descendingElements.pollLast());
        }
        return String.valueOf(descend);
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
