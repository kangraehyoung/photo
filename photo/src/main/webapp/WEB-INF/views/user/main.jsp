<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title></title>
    <link rel="stylesheet" href="style/reset.css" />
    <link rel="stylesheet" href="style/common.css" />
    <link rel="stylesheet" href="style/main.css" />
  </head>
  <body>
    <header>
      <h1>Raestagram</h1>
      <div class="bar-search">
        <img class="img-explore" src="src/icon/explore.png" alt="돋보기 아이콘" />
        <input class="input-searchBar" type="text" placeholder="검색" />
        <div class="box-filteredId">
          <div class="box-recentSearch">
            <p class="title-recentSearch">최근 검색 항목</p>
            <p class="content-recentSearch">최근 검색 내역 없음.</p>
          </div>
        </div>
      </div>
      <nav>
        <ul class="list-nav">
          <li><img src="src/icon/home.png" alt="홈 아이콘" /></li>
          <li><img src="src/icon/send.png" alt="다이렉트 메시지 아이콘" /></li>
          <li><img src="src/icon/add.png" alt="게시물 추가 아이콘" /></li>
          <li><img src="src/icon/compass.png" alt="탐색 아이콘" /></li>
          <li><img src="src/icon/heart.png" alt="좋아요 아이콘" /></li>
          <li class="list-profile">
            <img
              class="img-navProfile"
              src="src/img/profile/candy.jpg"
              alt="프로필 이미지"
            />

              <div class="wrap-menu">
                  <div class="menu-profile">
                    <img src="src/icon/user.png" alt="프로필 아이콘" />
                    <p>프로필</p>
                  </div>
                  <div class="menu-bookmark">
                    <img src="src/icon/bookmark.png" alt="프로필 아이콘" />
                    <p>저장됨</p>
                  </div>
                  <div class="menu-setting">
                    <img src="src/icon/setting.png" alt="프로필 아이콘" />
                    <p>설정</p>
                  </div>
                  <div class="menu-change">
                    <img src="src/icon/change.png" alt="프로필 아이콘" />
                    <p>계정 전환</p>
                  </div>
                  <div class="menu-logout">
                    <p >로그아웃</p>
                  </div>
              </div>

          </li>
        </ul>
      </nav>
      </header>
      </div>

    <main>
      <!-- 왼쪽 -->
      <div>
        <div class="box-story">
          <li>
            <img
              class="img-profile-56px img-story"
              src="src/img/profile/apple.jpg"
              alt="프로필 이미지"
            />
            <p class="name-story">apple_01</p>
          </li>
          <li>
            <img
              class="img-profile-56px img-story"
              src="src/img/profile/peach.jpg"
              alt="프로필 이미지"
            />
            <p class="name-story">peach_02</p>
          </li>
        </div>

        <div>
          <article class="box-feed">
            <div class="head-feed">
              <div class="profile-feed">
                <img
                  class="img-profile-32px"
                  src="src/img/profile/apple.jpg"
                  alt="프로필 이미지"
                />
                <div>
                  <p class="userName-feed">apple_01</p>
                  <p class="location-feed">Seoul, Kroea</p>
                </div>
              </div>
              <img class="icon-more" src="src/icon/more.png" alt="더보기 아이콘" />
            </div>

            <img class="img-feed" src="src/img/feed/apple.jpg" alt="피드 이미지" />

            <div class="icon-feed">
              <div>
                <img class="img-icon" src="src/icon/heart.png" alt="하트 아이콘" />
                <img class="img-icon" src="src/icon/chat.png" alt="댓글 아이콘" />
                <img
                  class="img-icon"
                  src="src/icon/send.png"
                  alt="다이렉트 메시지 아이콘"
                />
              </div>
              <img
                class="img-icon"
                src="src/icon/bookmark.png"
                alt="북마크 아이콘"
              />
            </div>

            <p class="text-like">좋아요 120개</p>

            <div class="box-comment"></div>

            <div class="box-chat">
              <img class="img-icon" src="src/icon/smile.png" alt="이모지 아이콘" />
              <form>
                <input
                  class="input-chat"
                  type="text"
                  placeholder="댓글 달기..."
                />
                <button class="btn-chat" type="submit">게시</button>
              </form>
            </div>
          </article>
        </div>
      </div>

      <!-- 오른쪽 -->
      <div class="box-aside">
        <div class="box-myProfile">
          <div>
            <img
              class="img-profile-56px"
              src="src/img/profile/candy.jpg"
              alt="프로필 이미지"
            />
            <p>candy_0426</p>
          </div>
          <button class="btn-blue" type="button">전환</button>
        </div>

        <div class="box-recommend">
          <div class="head-recommend">
            <h2>회원님을 위한 추천</h2>
            <button class="btn-recommend-all" type="button">모두 보기</button>
          </div>
          <div class="box-recommend-profile">
            <div class="profile-recommend">
              <img
                class="img-profile-32px"
                src="src/img/profile/watermelon.jpg"
                alt="프로필 이미지"
              />
              <div>
                <p class="userName-recommend">watermelon_03</p>
                <p class="follower-recommend">apple_01님이 팔로우합니다</p>
              </div>
            </div>
            <button class="btn-blue" type="button">팔로우</button>
          </div>
          <div class="box-recommend-profile">
            <div class="profile-recommend">
              <img
                class="img-profile-32px"
                src="src/img/profile/lemon.jpg"
                alt="프로필 이미지"
              />
              <div>
                <p class="userName-recommend">lemon_04</p>
                <p class="follower-recommend">candy_0426님이 팔로우합니다</p>
              </div>
            </div>
            <button class="btn-blue" type="button">팔로우</button>
          </div>
        </div>

        <div class="footer">
          <div class="footer-info">
            <a href="#">소개 ·</a>
            <a href="#">도움말 ·</a>
            <a href="#">홍보센터 ·</a>
            <a href="#">API ·</a>
            <a href="#">채용 정보 ·</a>
            <a href="#">개인정보처리방침 ·</a>
            <a href="#">약관 ·</a>
            <a href="#">위치 ·</a>
            <a href="#">언어</a>
          </div>
          <p>©2022 WESTAGRAM FROM HYERIN</p>
        </div>
      </div>
    </main>

    <script src="js/main.js"></script>
  </body>
</html>
