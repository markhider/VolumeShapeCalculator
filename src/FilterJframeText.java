import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

import javax.swing.text.DocumentFilter;

/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maryem
 */
public class FilterJframeText extends DocumentFilter {
      @Override
        public void insertString(FilterBypass fb, int off, String str, AttributeSet attr)
                throws BadLocationException {
            fb.insertString(off, str.replaceAll("\\D", ""), attr);  // remove non-digits
        }
                @Override
        public void replace(FilterBypass fb, int off, int len, String str, AttributeSet attr)
                throws BadLocationException {
            fb.replace(off, len, str.replaceAll("[^0-9.]", ""), attr);  // remove non-digits
        }
}
//text.replaceAll("[^0-9.]", "")