class Solution {
        public int solution(int[] bandage, int health, int[][] attacks) {
        int maxRecoveryTime = bandage[0];
        int recovery = bandage[1];
        int extraRecovery = bandage[2];

        int hp = health;
        for (int i = 0; i < attacks.length; i++) {
            int[] attack = attacks[i];
            if(hp < health) {
                int beforeAttackTime = attacks[i - 1][0];
                int t = attack[0] - beforeAttackTime - 1; // 공격 받기 전 기술을 연달아 사용한 시간
                hp += t * recovery + t / maxRecoveryTime * extraRecovery; // 회복 (+ 추가 회복)
            }
            if(hp > health) { // 최대 체력 이상 회복 불가
                hp = health;
            }
            hp -= attack[1]; // 몬스터 공격
            if(hp <= 0) { // 캐릭터 죽음
                return -1;
            }
        }
        return hp;
    }
}