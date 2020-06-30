'''08杨辉三角
给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。

在杨辉三角中，每个数是它左上方和右上方的数的和。

示例:

输入: 5
输出:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]'''


# 动态规划 知道一行的值之后可以轻松计算下一行的值
def generate(num_rows):
    triangle = []
    # row_num 为 0 1 ... num_rows-1
    for row_num in range(num_rows):
        # 初始化每一行，元素为None 元素个数等于行数
        row = [None for _ in range(row_num + 1)]
        # 每行首尾为1
        row[0], row[-1] = 1, 1

        # 每行第 2 个元素到第 n-1 个元素为该元素上一行左右之和
        for j in range(1, len(row) - 1):
            row[j] = triangle[row_num - 1][j - 1] + triangle[row_num - 1][j]

        triangle.append(row)
    return triangle


# 测试
if __name__ == '__main__':
    print(generate(10))
