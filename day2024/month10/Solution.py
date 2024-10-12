class Solution:
    def duplicateNumbersXOR(self, nums: List[int]) -> int:
        # 统计每个数字出现的次数
        counter = Counter(nums)
        ans = 0
        # 遍历并计算
        for x, count in counter.items():
            if count == 2:
                ans ^= x  # XOR操作
        return ans