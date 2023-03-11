package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {6, 0, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 6, 7};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {6, 0, 7, 9, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 6, 7, 9};
        assertThat(result).containsExactly(expected);
    }
}