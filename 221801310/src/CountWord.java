import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class CountWord {
    /*
        统计文本中有多少个单词，单词规则：至少以4个英文字母开头，跟上字母数字符号，单词以分隔符分割，不区分大小写。
        传入参数：text 文本内容（可优化
    */
    public static int countWordNum(String text){
        int num = 0;
        //存放被分隔符分开的内容
        String[] words;

        //除了字母数字以外的所有字符都作为分隔符
        words = SplitWord.splitWord(text);
        num = SplitWord.splitLegalWord(words).size();

        return num;
    }

    public static int countWordNum(HashMap<String,Integer> legalWords){
        //不行，直接返回size会被截断 因为size()函数返回值是int
        return legalWords.size();
    }

}
