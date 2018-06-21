package cracking.four;

import cracking.util.BinaryNode;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSix {
  @Test
  public void testOne() {
    BinaryNode[] nodes = new BinaryNode[100];
    BinaryNode head = new BinaryNode(38);
    nodes[1] = head.add(1);
    nodes[82] = head.add(82);
    nodes[13] = head.add(13);
    nodes[50] = head.add(50);
    nodes[92] = head.add(92);
    nodes[7] = head.add(7);
    nodes[19] = head.add(19);
    nodes[4] = head.add(4);
    nodes[23] = head.add(23);
    nodes[3] = head.add(3);

    Six six = new Six();
    BinaryNode result = six.nextNode(nodes[19]);
    Assert.assertEquals(23, result.item.intValue());
    result = six.nextNode(nodes[23]);
    Assert.assertEquals(38, result.item.intValue());
    result = six.nextNode(nodes[13]);
    Assert.assertEquals(19, result.item.intValue());
    result = six.nextNode(nodes[1]);
    Assert.assertEquals(3, result.item.intValue());

    result = six.previousNode(nodes[19]);
    Assert.assertEquals(13, result.item.intValue());
    result = six.previousNode(nodes[7]);
    Assert.assertEquals(4, result.item.intValue());
    result = six.previousNode(nodes[3]);
    Assert.assertEquals( 1, result.item.intValue());
    result = six.previousNode(nodes[1]);
    Assert.assertNull(result);
  }
}
